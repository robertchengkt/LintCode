class Solution:
    # @param node, a undirected graph node
    # @return a undirected graph node
    def __init__(self):
        self.dict = {}

    def cloneGraph(self, node):
        # write your code here
        if root is None:
          return None

        if node.label in self.dict:
          return self.dict[node.label]
        root = UndirectedGraphNode(node.label)
        self.dict[node.label] = root
        for item in node.neightbors:
            root.neighbors.append(self.cloneGraph(item))
        return root



