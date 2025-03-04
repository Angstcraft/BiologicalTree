Hey, this is a little project for my class.
this is the Tree diagram.
+-------------------+
|      Tree         |
+-------------------+
| - stem: Stem      |
| - treeType: TreeType|
+-------------------+
| + displayInfo()   |
+-------------------+

       |
       V

+-------------------+
|      Stem         |
+-------------------+
| - branch1: Branch |
| - branch2: Branch |
+-------------------+
| + getBranches()   |
+-------------------+

       |
       V

+-------------------+
|     Branch        |
+-------------------+
| - twig1: Twig     |
| - twig2: Twig     |
| - twig3: Twig     |
+-------------------+
| + getTwigs()      |
+-------------------+

       |
       V

+-------------------+
|     Twig          |
+-------------------+
| - leaf1: Leaf     |
| - leaf2: Leaf     |
| - leaf3: Leaf     |
| - leaf4: Leaf     |
+-------------------+
| + getLeaves()     |
+-------------------+

       |
       V

+-------------------+
|     Leaf          |
+-------------------+
| - type: String    |
| - height: double  |
| - width: double   |
+-------------------+
| + getType()       |
| + getHeight()     |
| + getWidth()      |
+-------------------+
