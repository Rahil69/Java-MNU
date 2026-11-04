# Tutorial 04 Answers

## 1. Transport hierarchy

Output from `Transport t = new Speedboat("North Line"); t.announce();`:

```
Speedboat on North Line
```

The variable is a `Transport`, but the object is a `Speedboat`. Java picks the method from the actual object at runtime, so Speedboat's `announce()` runs.

`super(route)` is needed because `Transport` has no no-argument constructor. A subclass constructor has to call a parent constructor first, so Speedboat passes `route` up to Transport to set it.

## 2. Overloading

See `FareCalculator.java`. Output:

```
30
60
```

Both methods are called `calculateFare` but have different parameter lists. The compiler picks which one to call from the arguments (one int or two ints), so it's decided at compile time. That's why it's called compile-time polymorphism.

## 3. Interface and abstract class

Output:

```
Delivery label
Parcel delivered
Parcel tracked
```

- Abstract methods: `deliver()` in Delivery and `track()` in Trackable.
- Concrete methods: `label()` in Delivery, plus `deliver()` and `track()` in Parcel.
- Only `Parcel` can be created with `new`. You can't create a `Delivery` (it's abstract) or a `Trackable` (it's an interface).

Interface methods are automatically `public`. When you override a method you can't make it less visible, so `track()` in Parcel must be `public`, or it won't compile.

## 4. Output trace

See `OutputTrace.java`. Output:

```
Derived show
Base
```

- `b.show()` runs **Derived's** `show()`, because methods use the real object type at runtime.
- `b.name` gives **"Base"**, because fields aren't overridden. They use the variable's type (`Base`), not the object's type.

## Extension

In `TransportDemo.java`, an `ArrayList<Transport>` holds a Speedboat and a Ferry, and the loop calls `announce()` on each:

```
Speedboat on North Line
Ferry on South Line
```
