# Tutorial 02 Answers

## 1. Array/List operations

Output:

```
Array length: 3
List size: 2
Readings: [31, 30]
Dan
[Zoe]
```

`set(0, value)` fails on an empty list because there's nothing at index 0 to replace yet. It throws IndexOutOfBoundsException, so you have to use `add` first.

## 2. Wrapper classes

Output: `74`

- Autoboxing: Java automatically turns `int` into `Integer` (`scores.add(score)`).
- Unboxing: Java automatically turns `Integer` back into `int` (`int x = scores.get(0)`).

Legal as generic types: `Integer`, `String`, `Double`.
Not legal: `int`, `double`, because they're primitives.

## 3. Static and instance

Output:

```
A=1, total=2
B=2, total=2
```

- static field: `total` (shared by all Visitors)
- instance field: `number` (each Visitor has its own)
- constructor: `Visitor()`

With a third Visitor, the numbers stay the same, but total becomes 3 on both lines.

## 4. Mistakes

- `scores.length` should be `scores.size()`, because ArrayList uses a method.
- `numbers.get(0)` should be `numbers[0]`, because arrays use brackets.

## Extension

See `AverageDemo.java`. Output: `Average: 80.0`. If the list is empty it prints "List is empty".
