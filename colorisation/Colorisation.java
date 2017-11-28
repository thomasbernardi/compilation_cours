import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Colorisation {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vous pouvez definir votre graphe par un liste d'aretes.");
        System.out.println("Une ligne par arete, avec ne espace entre chaque sommet.");
        System.out.println("Il suffit d'entrer une arete dans un seul sens (les aretes n'ont pas d'orientation).");
        System.out.println("Voyez g1.txt pour un example.");
        System.out.println("Le resultat sera un map entre les sommets et ses couleurs. Un -1 signifie un sommet spille.");
        System.out.println();
        System.out.println("Entrez le nom du dossier qui contient le graphe:");
        String fileName = in.nextLine();
        System.out.println("Entrez k:");
        int k = in.nextInt();
        List<String> starts = new ArrayList<>();
        List<String> ends = new ArrayList<>();
        Scanner input;
        try {
            FileInputStream file = new FileInputStream(fileName);
            input = new Scanner(file);
            while (input.hasNext()) {
                starts.add(input.next());
                ends.add(input.next());
            }
            Graph graph = new Graph(starts, ends);
            Map<String, Integer> colors = coloriser(graph, k);
            System.out.println(colors);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found...");
        }

    }

    /**
     *
     * @param graph
     * @param k
     * @return a map between sommets and their color with -1 representing a sommet put onto the stack
     *      and each number between 1 and k inclusive representing a distinct color
     */
    static Map<String, Integer> coloriser(Graph graph, int k) {
        Map<String, Integer> color = new HashMap<>();
        System.out.println("En train de coloriser avec " + k + " couleurs...");
        //this is breaking my heart, but while I am in love with immutability, I shall sacrifice it here
        coloriser(graph, graph, k, color);
        return color;
    }

    static void coloriser(Graph masterGraph, Graph graph, int k, Map<String, Integer> color) {
        if (!graph.isEmpty()) {
            String toDelete = graph.smallestSommet();
            Set<String> neighbors = graph.neighbors(toDelete);
            if (neighbors.size() >= k) {
                //pas de sommet trivialement colorable
                toDelete = graph.largestSommet();
                Graph newGraph = graph.delete(toDelete);
                coloriser(masterGraph, newGraph, k, color);
                //colorisation optimiste:
                //taken[i] refers to whether color i+1 is taken
                boolean taken[] = new boolean[k];
                for (int i = 0; i < k; i++) {
                    taken[i] = false;
                }
                for (String element : masterGraph.neighbors(toDelete)) {
                    int n = color.get(element);
                    taken[n - 1] = true;
                }
                int toDeleteColor = -1;
                int currColor = 0;
                while (currColor < k && toDeleteColor == -1) {
                    if (!taken[currColor]) toDeleteColor = currColor + 1;
                    currColor++;
                }
                color.put(toDelete, toDeleteColor);
            } else {
                //il existe un sommet trivialement colorable
                Graph newGraph = graph.delete(toDelete);
                coloriser(masterGraph, newGraph, k, color);
                int couleurDisponible = 0;
                Set<Integer> couleursPris = new HashSet<>();
                for (String element : graph.neighbors(toDelete)) {
                    couleursPris.add(color.get(element));
                }
                for (int i = 1; i <= k; i++) {
                    if (!couleursPris.contains(i)) {
                        couleurDisponible = i;
                        i = k + 1;
                    }
                }
                color.put(toDelete, couleurDisponible);
            }
        }
    }
}

class Graph {
    private Map<String, Set<String>> aretes;
    private Map<Integer, Set<String>> sizes;

    /**
     * Creates a graph from a list of edges
     * @requires starts and ends are of the same size
     * @param starts
     * @param ends
     */
    public Graph(List<String> starts, List<String> ends){
        aretes = new HashMap<>();
        for (int i = 0; i < starts.size(); i++) {
            String start = starts.get(i);
            String end = ends.get(i);
            if (!aretes.containsKey(start)) {
                aretes.put(start, new HashSet<>());
            }
            if (!aretes.containsKey(end)) {
                aretes.put(end, new HashSet<>());
            }
            aretes.get(start).add(end);
            aretes.get(end).add(start);
        }
        sizes = sizes(aretes);
    }

    private static Map<Integer, Set<String>> sizes(Map<String, Set<String>> aretes) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (String element : aretes.keySet()) {
            int size = aretes.get(element).size();
            if (!result.containsKey(size)) {
                result.put(size, new HashSet<>());
            }
            result.get(size).add(element);
        }
        return result;
    }

    public Graph(Map<String, Set<String>> aretes) {
        this.aretes = aretes;
        sizes = sizes(aretes);

    }

    public Set<String> neighbors(String sommet) {
        return aretes.get(sommet);
    }

    public Graph delete(String toDelete) {
        Map<String, Set<String>> newGraph = new HashMap<>();
        for (String start : aretes.keySet()) {
            if (!start.equals(toDelete)) {
                Set<String> newEnds = new HashSet<>();
                for (String end : aretes.get(start)) {
                    if (!end.equals(toDelete)) {
                        newEnds.add(end);
                    }
                }
                newGraph.put(start, newEnds);
            }
        }
        return new Graph(newGraph);
    }

    public String smallestSommet() {
        if (aretes.size() != 0) {
            List<Integer> sizes = new ArrayList<>(this.sizes.keySet());
            Collections.sort(sizes);
            return this.sizes.get(sizes.get(0)).iterator().next();
        } else {
            return null;
        }
    }

    public String largestSommet() {
        if (aretes.size() != 0) {
            List<Integer> sizes = new ArrayList<>(this.sizes.keySet());
            Collections.sort(sizes);
            return this.sizes.get(sizes.get(sizes.size() - 1)).iterator().next();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return aretes.isEmpty();
    }


}