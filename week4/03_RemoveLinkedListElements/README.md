
# Remove Linked List Elements

## 1. Problem

The task is to remove every node whose value equals
a given target value. The remaining nodes must stay
in their original order.

## 2. Approach

I create a dummy node before the head of the list.
This helps handle the case when the first node must
be removed.

I use a pointer called `current` to examine the
next node.

If the next node contains the target value, I skip
that node by changing `current.next`.

Otherwise, I move `current` forward.

I return `dummy.next`, which points to the new head.

### Example

Input: 1 -> 2 -> 6 -> 3 -> 6 -> 4 -> 5 -> 6
Target value: 6

- The first nodes, 1 and 2, are kept.
- The first 6 is skipped.
- Node 3 is kept.
- The next 6 is skipped.
- Nodes 4 and 5 are kept.
- The last 6 is skipped.

Output: 1 -> 2 -> 3 -> 4 -> 5

### Testing and challenges

I need to test an empty list, a list with no
matching values, and a list where every node
matches the target.

I also need to test when the head itself must
be removed, including several matching nodes
at the beginning.

The main challenge is handling consecutive
matching nodes without moving the pointer too soon.

## 3. Complexity Analysis

Time Complexity: O(n)

The algorithm examines each node at most once.
Each pointer update takes constant time.

Space Complexity: O(1)

Only a dummy node and a pointer are used.
The list is modified in place.

## 4. Reflection / Improvement

The algorithm is optimal in time complexity because
every node must be checked.

The dummy node makes the implementation simpler,
especially when the original head must be removed.
The solution already uses constant extra space.
