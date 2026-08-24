# ⚡ Java DSA Cheatsheet

## Arrays

```java
int n = arr.length;
Arrays.sort(arr);
```

## HashMap

```java
HashMap<Integer, Integer> map = new HashMap<>();

map.put(x, map.getOrDefault(x, 0) + 1);
map.containsKey(x);
```

## HashSet

```java
HashSet<Integer> set = new HashSet<>();
set.add(x);
set.contains(x);
```

## Stack

```java
Stack<Character> st = new Stack<>();
st.push(c);
st.pop();
st.peek();
```

## Queue

```java
Queue<Integer> q = new LinkedList<>();
q.offer(x);
q.poll();
```

## Priority Queue

```java
PriorityQueue<Integer> min = new PriorityQueue<>();

PriorityQueue<Integer> max =
    new PriorityQueue<>(Collections.reverseOrder());
```

## Binary Search

```java
int l = 0, r = n - 1;

while (l <= r) {
    int mid = l + (r - l) / 2;
}
```

## DFS

```java
void dfs(int node){
    vis[node] = true;
    for(int nxt : graph[node]){
        if(!vis[nxt]) dfs(nxt);
    }
}
```

## BFS

```java
Queue<Integer> q = new LinkedList<>();
q.offer(start);

while(!q.isEmpty()){
    int node = q.poll();
}
```

## GCD

```java
int gcd(int a, int b){
    while(b != 0){
        int t = a % b;
        a = b;
        b = t;
    }
    return a;
}
```

## Prefix Sum

```java
prefix[i + 1] = prefix[i] + arr[i];
```

## Useful Complexity

| Operation | Time |
|-----------|------|
| Array Traverse | O(n) |
| HashMap | O(1) avg |
| Sort | O(n log n) |
| Binary Search | O(log n) |
| DFS/BFS | O(V+E) |
| Heap Push/Pop | O(log n) |