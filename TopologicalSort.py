class Solution:
    """
    @param graph: A list of Directed graph node
    @return: A list of graph nodes in topological order.
    """
    def topSort(self, graph):
        # write your code here
        countdepth={}
        for i in graph:
            countdepth[i] = 0
        for x in graph:
            for j in x.neighbors:
                countdepth[j] += 1
        q = []
        for i in graph:
            if countdepth[i] == 0:
                res = self.bfs(countdepth, q.append(i))
        return res

    def dfs(self, i, countdepth, ans):
        ans.append(i)
        countdepth[i] -= 1
        for j in i.neighbors:
            countdepth[j] -= 1
            if countdepth[j] == 0:
                self.dfs(j, countdepth, ans)

    def bfs(self, j, countdepth, tmp):


