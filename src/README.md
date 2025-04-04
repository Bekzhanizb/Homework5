# Design Patterns - Proxy and Flyweight Patterns

This repository provides explanations for the **Proxy Pattern** and **Flyweight Pattern** with real-world use cases. The goal is to demonstrate how these patterns optimize system design, improve memory usage, and reduce overhead.

## Proxy Pattern

### Problem Solved

In an image management system for a real estate agency, agents upload high-resolution images of properties. Loading these images in full resolution for all users can negatively impact performance. Instead, low-resolution thumbnails are initially displayed, and high-resolution images are only loaded when requested (e.g., when a user clicks to zoom). This approach enhances responsiveness and optimizes the user experience.

### How the Pattern Simplifies the Design

The **Proxy Pattern** is used to control access to the high-resolution images. A proxy object is created to represent the image, showing a low-resolution thumbnail immediately. The proxy delays the loading of the full-resolution image until it is explicitly requested (via `.displayFullImage()` method). This pattern helps improve performance by not loading full images unnecessarily. Additionally, a **Protection Proxy** can be added to ensure that only authenticated users (e.g., agents) can upload or replace images, providing security in the system.

---

## Flyweight Pattern

### Problem Solved

In a map application displaying thousands of markers (e.g., gas stations, restaurants, hospitals), each marker may share the same icon, color, and label style. Storing these styles individually for every marker consumes a significant amount of memory. The **Flyweight Pattern** is used to share common marker styles (icons, colors, etc.) across multiple marker objects, reducing memory usage and improving performance.

### How the Pattern Simplifies the Design

The **Flyweight Pattern** allows for the sharing of immutable, common style data between markers. Instead of storing a new style object for each marker, the application reuses existing style objects whenever the same style is required for multiple markers. This drastically reduces memory consumption as only one object per unique style is stored. In addition, the Flyweight pattern can be used to track and log the number of unique styles versus the total number of markers created, providing insights into memory efficiency.

---

## Conclusion

### Proxy Pattern:
The **Proxy Pattern** optimizes performance by deferring the loading of high-resolution images, ensuring that resources are only consumed when necessary. It also adds a layer of security by ensuring that only authorized users (e.g., logged-in agents) can perform sensitive actions like uploading or replacing images.

### Flyweight Pattern:
The **Flyweight Pattern** addresses the problem of memory usage in applications with large numbers of similar objects. By sharing common data (such as marker styles) across multiple objects, the pattern reduces memory consumption and improves application performance, especially when handling large datasets or visual elements.

Both patterns are practical solutions for real-world system optimizations, focusing on performance, memory efficiency, and security.
