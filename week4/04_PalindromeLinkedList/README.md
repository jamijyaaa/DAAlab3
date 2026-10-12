
# Palindrome Linked List

## 1. Problem

The task is to determine whether the values in a
singly linked list read the same forward and backward.

The method returns true if the list is a palindrome
and false otherwise.

## 2. Approach

First, I check whether the list is empty or contains
only one node. Both cases are palindromes.

I use slow and fast pointers to find the middle.
The slow pointer moves one node at a time, while
the fast pointer moves two nodes at a time.

Next, I reverse the second half of the list.

I compare the first half with the reversed second
half. If any pair of values differs, the list is
not a palindrome.

Finally, I restore the second half so that the
original list structure remains unchanged.

### Example

Input: 1 -> 2 -> 2 -> 1

- Find the middle of the list.
- The second half is 2 -> 1.
- Reverse it to get 1 -> 2.
- Compare the first half, 1 -> 2, with 1 -> 2.
- All compared values match.
- Restore the original list.

Output: true

Another example:

Input: 1 -> 2 -> 3

The values on the two sides do not match.

Output: false

### Testing and challenges

I need to test an empty list, a single node, an
even-length palindrome, an odd-length palindrome,
and a list that is not a palindrome.

The main challenge is finding the middle correctly
for both odd and even list lengths.

Another important detail is preserving the original
list by reversing the second half again after
the comparison.

## 3. Complexity Analysis

Time Complexity: O(n)

Finding the middle takes O(n) time. Reversing the
second half and comparing the nodes also take O(n)
time. These operations together remain O(n).

Space Complexity: O(1)

The algorithm uses a fixed number of pointers.
It does not create another list or an array.

## 4. Reflection / Improvement

The solution already achieves linear time and
constant auxiliary space.

A simpler alternative is to copy the values into
an array and compare both ends. However, this
requires O(n) extra space.

The current approach is more space-efficient.
