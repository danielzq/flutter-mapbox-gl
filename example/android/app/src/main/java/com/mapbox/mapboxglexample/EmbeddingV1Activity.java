package com.mapbox.mapboxglexample;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.mapbox.mapboxgl.MapboxMapsPlugin;

import io.flutter.app.FlutterActivity;


/**
 * Created by Daniel on 2020/12/14.
 */
class EmbeddingV1Activity extends FlutterActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapboxMapsPlugin.registerWith(registrarFor("com.mapbox.mapboxgl.MapboxMapsPlugin"));
    }
}
