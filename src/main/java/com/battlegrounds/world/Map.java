package com.battlegrounds.world;

import java.util.List;
import java.util.ArrayList;

public class Map {
    // Terrain types
    private String terrainType;
    private List<String> collisionData;
    private List<String> spawnPoints;
    private List<String> environmentalObjects;

    public Map(String terrainType) {
        this.terrainType = terrainType;
        this.collisionData = new ArrayList<>();
        this.spawnPoints = new ArrayList<>();
        this.environmentalObjects = new ArrayList<>();
    }

    // Manage terrain
    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public String getTerrainType() {
        return terrainType;
    }

    // Manage collision data
    public void addCollisionData(String data) {
        collisionData.add(data);
    }

    public List<String> getCollisionData() {
        return collisionData;
    }

    // Manage spawn points
    public void addSpawnPoint(String spawnPoint) {
        spawnPoints.add(spawnPoint);
    }

    public List<String> getSpawnPoints() {
        return spawnPoints;
    }

    // Manage environmental objects
    public void addEnvironmentalObject(String object) {
        environmentalObjects.add(object);
    }

    public List<String> getEnvironmentalObjects() {
        return environmentalObjects;
    }
}