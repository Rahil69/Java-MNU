# Tutorial 03 Answers

## 1. Controlled book loans

Output:

```
Mariyam has 3 loans
```

The 4th `borrowOne()` does nothing because `borrowed` is already 3.

`borrowed` is private, so MemberDemo can't write `m.borrowed = 10;`. That's a compile error. The only way to change it is `borrowOne()`, and that method enforces the limit of 3.

## 2. Constructor design

- `Member()` calls `this("Guest")`, so the name becomes "Guest" with 0 loans.
- `Member(String name, int borrowed)` only keeps `borrowed` if it's 0 to 3. Otherwise it stays 0.

Output:

```
Guest has 0 loans
Ali has 2 loans
Sara has 0 loans
```

Constructors have no return type because they aren't called like normal methods. They just set up the new object, and `new` gives you the object back. If you add a return type, it becomes a normal method instead of a constructor.

## 3. Access and compilation

Output: `Capacity: 12`

`w.cash = 30;` doesn't compile because `cash` is private, so only code inside `Wallet` can use it. You'd fix it by adding a public method like `setCash(int c)` to Wallet.

- `private`: only inside the same class
- package-private (no keyword): any class in the same package
- `protected`: same package, plus subclasses in other packages
- `public`: anywhere

## 4. Instance defaults

- `int count` is `0`
- `boolean active` is `false`
- `String title` is `null`

If you write no constructor at all, Java adds an invisible default one that takes no arguments. An explicit no-arg constructor is one you write yourself, like `Member()`, and it can set values. Once you write any constructor, Java no longer adds the default one.

## Extension: UML for Member

```
+-------------------------------------------+
| Member                                    |
+-------------------------------------------+
| - name : String                           |
| - borrowed : int                          |
+-------------------------------------------+
| + Member()                                |
| + Member(name : String)                   |
| + Member(name : String, borrowed : int)   |
| + getName() : String                      |
| + getBorrowed() : int                     |
| + borrowOne() : void                      |
+-------------------------------------------+
```

`-` means private and `+` means public.
