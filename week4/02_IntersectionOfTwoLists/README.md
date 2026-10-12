
# Intersection of Two Linked Lists

## 1. Problem

The task is to find the first node shared by two
singly linked lists. If the lists do not intersect,
the method must return null.

Intersection means that both lists contain the same
node in memory, not just nodes with equal values.

## 2. Approach

I use two pointers, `pointerA` and `pointerB`.

The first pointer starts at the head of list A.
The second pointer starts at the head of list B.

Both pointers move one node at a time. When a pointer
reaches the end of its list, it starts again at the
head of the other list.

This makes both pointers travel the same total
distance. If an intersection exists, they eventually
reach the same node. Otherwise, both become null.

### Example

List A: 4 -> 1 -> 8 -> 4 -> 5
List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5

Assume the nodes beginning with 8 are physically
shared by both lists.

- Both pointers start at their respective heads.
- They move through their lists.
- At the end, each pointer switches to the other head.
- They eventually meet at the shared node with value 8.

Output: the intersecting node with value 8.

### Testing and challenges

I need to test lists that intersect, lists that do
not intersect, and lists that are both empty.

Another important case is when the intersection
occurs at the first node of both lists.

The main challenge is understanding that equal
values do not prove an intersection. The references
must point to the same node.

## 3. Complexity Analysis

Time Complexity: O(n + m)

Each pointer traverses at most both lists, where n
and m are their respective lengths.

Space Complexity: O(1)

Only two pointers are used. No additional data
structure is needed.

## 4. Reflection / Improvement

This solution is already optimal in time complexity
for the general case because the lists may need to
be traversed completely.

An alternative is to calculate both lengths, align
the starting positions, and then compare nodes.
That approach also uses O(n + m) time and O(1) space.
