# 1. Requirements Gathering

## Functional Requirements:
get(key) → returns the value if present; else -1.
put(key, value) → insert or update a key-value pair.
If capacity is exceeded → evict the least recently used item.

## Non-Functional Requirements:
Both operations must be O(1) time complexity.
Should efficiently manage memory.
The cache should be thread-safe, allowing concurrent access from multiple threads.