package bfs

import java.util.LinkedList
import java.util.Queue

val visited = MutableList(9) { false }
val graph = ArrayList<ArrayList<Int>>()

fun main() {
    // 그래프 초기화
    for (i in 0 until 9) {
        graph.add(ArrayList())
    }
    // 노드 1에 연결된 노드 정보 저장
    graph[1].add(2)
    graph[1].add(3)
    graph[1].add(8)

    // 노드 2에 연결된 노드 정보 저장
    graph[2].add(1)
    graph[2].add(7)

    // 노드 3에 연결된 노드 정보 저장
    graph[3].add(1)
    graph[3].add(4)
    graph[3].add(5)

    // 노드 4에 연결된 노드 정보 저장
    graph[4].add(3)
    graph[4].add(5)

    // 노드 5에 연결된 노드 정보 저장
    graph[5].add(3)
    graph[5].add(4)

    // 노드 6에 연결된 노드 정보 저장
    graph[6].add(7)

    // 노드 7에 연결된 노드 정보 저장
    graph[7].add(2)
    graph[7].add(6)
    graph[7].add(8)

    // 노드 8에 연결된 노드 정보 저장
    graph[8].add(1)
    graph[8].add(7)

    bfs(1)
}

// BFS 함수 정의
fun bfs(start: Int) {
    val q: Queue<Int> = LinkedList()
    q.offer(start)
    // 현재 노드를 방문 처리
    visited[start] = true
    // 큐가 빌 때까지 반복
    while (!q.isEmpty()) {
        // 큐에서 하나의 원소를 뽑아 출력
        val x = q.poll()
        print("$x ")
        // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
        for (i in 0 until graph[x].size) {
            val y = graph[x][i]
            if (!visited[y]) {
                q.offer(y)
                visited[y] = true
            }
        }
    }
}
