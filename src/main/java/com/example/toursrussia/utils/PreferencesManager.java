package com.example.toursrussia.utils;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

public class PreferencesManager {
    private static final String PREF_NAME = "ToursRussia";
    private static final String FAVORITES_KEY = "favorites";
    private static final String THEME_KEY = "theme";
    
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public PreferencesManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void addFavorite(int tourId) {
        Set<String> favorites = new HashSet<>(sharedPreferences.getStringSet(FAVORITES_KEY, new HashSet<>()));
        favorites.add(String.valueOf(tourId));
        editor.putStringSet(FAVORITES_KEY, favorites).apply();
    }

    public void removeFavorite(int tourId) {
        Set<String> favorites = new HashSet<>(sharedPreferences.getStringSet(FAVORITES_KEY, new HashSet<>()));
        favorites.remove(String.valueOf(tourId));
        editor.putStringSet(FAVORITES_KEY, favorites).apply();
    }

    public boolean isFavorite(int tourId) {
        Set<String> favorites = sharedPreferences.getStringSet(FAVORITES_KEY, new HashSet<>());
        return favorites.contains(String.valueOf(tourId));
    }

    public Set<String> getFavorites() {
        return new HashSet<>(sharedPreferences.getStringSet(FAVORITES_KEY, new HashSet<>()));
    }

    public void setDarkTheme(boolean isDark) {
        editor.putBoolean(THEME_KEY, isDark).apply();
    }

    public boolean isDarkTheme() {
        return sharedPreferences.getBoolean(THEME_KEY, false);
    }
}
