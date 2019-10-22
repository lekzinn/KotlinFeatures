package com.albsilva.kotlinfeatures.functions.advanced

data class Graph(val vertices: List<Vertex>)
data class Vertex(val neighbors: HashSet<Vertex>)

fun dfs(graph: Graph) {
    val visited = mutableSetOf<Vertex>()
    fun dfs(current: Vertex) {
        if (!visited.add(current)) return;
        for (v in current.neighbors)
            dfs(v)
    }
    dfs(graph.vertices[0])
}


