The search starts from vertex `A`.

* `C` is the first vertex on `A`’s adjacency list and is unmarked, so DFS visits `C`.
* From `C`, vertex `A` is already marked, so DFS continues to `B`.
* From `B`, vertices `A` and `C` are already marked, so DFS visits `E`.
* From `E`, vertex `G` is unmarked, so DFS visits `G`.
* From `G`, vertex `F` is unmarked, so DFS visits `F`.
* `F` has no unmarked adjacent vertices, so DFS returns back through `G`, `E`, and `B`.
* Back at `C`, vertex `D` is still unmarked, so DFS visits `D`.
* `D` has no unmarked adjacent vertices, and the search finishes because all vertices are marked.

DFS order:

`A → C → B → E → G → F → D`
