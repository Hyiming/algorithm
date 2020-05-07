package 数据结构和算法.图;

import java.util.LinkedList;

/**
 * @ClassName Graph
 * @Author huangyiming@sensetime.com
 * @Date 2020/3/15 17:11
 * @Description Graph
 */
public class Graph {
    // 顶点的个数
    private int v ;
    // 邻接表
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        this.v = v;    adj = new LinkedList[v];    for (int i=0; i<v; ++i) {      adj[i] = new LinkedList<>();    }  }
}
