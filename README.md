# Unexpected Behavior with Kotlin's map Function on Mutable Collections

This repository demonstrates a potential issue when using Kotlin's `map` function with mutable collections and the importance of understanding its immutability characteristics. The `BuggyMap.kt` file showcases a scenario where the expected behavior is not achieved due to improper handling of mutable state within the `map` function's lambda expression. This can lead to subtle bugs that are difficult to track down.

The `FixedMap.kt` file presents a corrected version that uses an alternative approach to achieve the desired outcome, emphasizing the best practices to avoid such unexpected behavior.