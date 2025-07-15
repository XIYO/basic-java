#!/bin/bash

# Fix package declarations in all Java files
echo "Fixing package declarations..."

# Find all Java files with incorrect package declaration
find /home/xiyo/dev/basic-java/src -name "*.java" -type f | while read file; do
    # Check if file contains incorrect package declaration
    if grep -q "^package main.java.javabasics" "$file"; then
        echo "Fixing: $file"
        # Replace 'package main.java.javabasics' with 'package javabasics'
        sed -i 's/^package main\.java\.javabasics/package javabasics/g' "$file"
    fi
done

echo "Package declarations fixed!"