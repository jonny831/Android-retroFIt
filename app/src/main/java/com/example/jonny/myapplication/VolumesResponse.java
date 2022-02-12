package com.example.jonny.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VolumesResponse {
    public class VolumesResponse {
        @SerializedName("kind")
        @Expose
        private String kind;

        @SerializedName("items")
        @Expose
        List<Volume> items = null;

        @SerializedName("totalItems")
        @Expose
        int totalItems;

        public String getKind() {
            return kind;
        }

        public List<Volume> getItems() {
            return items;
        }

        public int getTotalItems() {
            return totalItems;
        }
    }
}