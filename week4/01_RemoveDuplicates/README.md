
# Remove Duplicates from Sorted List

## 1. Problem

The task is to remove duplicate values from a sorted
singly linked list. Each value should appear only once.
The original order of the nodes must be preserved.

## 2. Approach

I use a pointer called `current` to traverse the list.

I compare the current node with the next node.
If their values are equal, I skip the next node by
updating `current.next`.

If their values are different, I move `current`
to the next node.

I continue until the current node or its next node
is null.

### Example

Input: 1 -> 1 -> 2 -> 3 -> 3

- Compare 1 and 1. Skip the second 1.
- Compare 1 and 2. Move to 2.
- Compare 2 and 3. Move to 3.
- Compare 3 and 3. Skip the second 3.
- The traversal ends.

Output: 1 -> 2 -> 3

### Testing and challenges

I need to test an empty list, a list with one node,
a list without duplicates, and a list containing
several repeated values.

An important edge case is when all nodes have the
same value. The algorithm must keep only one node.

The main challenge is updating links correctly
without skipping a value that should be kept.

## 3. Complexity Analysis

Time Complexity: O(n)

The algorithm visits each node at most once.
Each comparison and pointer update takes O(1) time.

Space Complexity: O(1)

Only one pointer is used. No additional collection
is created, and the list is modified in place.

## 4. Reflection / Improvement

The solution is already optimal for time complexity
because every node may need to be examined.

The implementation uses constant extra space,
so there is no need for an additional data structure.
