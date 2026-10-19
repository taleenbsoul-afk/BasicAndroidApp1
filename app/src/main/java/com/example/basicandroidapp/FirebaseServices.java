package com.example.basicandroidapp;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseServices {
    private static FirebaseServices instance;
    private final FirebaseAuth auth;
    private final FirebaseFirestore db;
    private final FirebaseStorage storage;

    public FirebaseServices(FirebaseAuth auth, FirebaseFirestore db, FirebaseStorage storage) {
        this.auth = auth;
        this.db = db;
        this.storage = storage;
    }

    public static FirebaseServices getInstance() {
        return instance;
    }

    public static void setInstance(FirebaseServices instance) {
        FirebaseServices.instance = instance;
    }

    public FirebaseAuth getAuth() {
        return auth;
    }

    public FirebaseFirestore getDb() {
        return db;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "FirebaseServices{" +
                "auth=" + auth +
                ", db=" + db +
                ", storage=" + storage +
                '}';
    }
}
