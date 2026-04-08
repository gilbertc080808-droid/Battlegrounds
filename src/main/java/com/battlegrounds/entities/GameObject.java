package com.battlegrounds.entities;

/**
 * Base class for all interactive game objects like items, obstacles, and environmental objects.
 */
public abstract class GameObject {
    protected String id;
    protected String name;

    public GameObject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void interact();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}