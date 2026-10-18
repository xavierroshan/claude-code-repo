# claude-code-repo

A test repository for trying out Claude Code and git.

## Java project structure

```
src/com/example/Main.java   source code (package com.example)
lib/                        external .jar dependencies
out/                        compiled .class files (git-ignored)
```

Compile and run:

```
javac -d out src/com/example/*.java
java -cp out com.example.Main
```
