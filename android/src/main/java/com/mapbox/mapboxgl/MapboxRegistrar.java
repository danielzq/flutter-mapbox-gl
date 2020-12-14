package com.mapbox.mapboxgl;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.Nullable;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.FlutterView;
import io.flutter.view.TextureRegistry;

/**
 * Created by Daniel on 2020/12/14.
 */
class MapboxRegistrar implements PluginRegistry.Registrar {

    private final FlutterPlugin.FlutterPluginBinding binding;
    private final ActivityPluginBinding activityPluginBinding;
    private Activity activity;

    public MapboxRegistrar(Activity activity, FlutterPlugin.FlutterPluginBinding binding, @Nullable ActivityPluginBinding activityPluginBinding) {
        this.activity = activity;
        this.binding = binding;
        this.activityPluginBinding = activityPluginBinding;
    }

    @Override
    public Activity activity() {
        return activityPluginBinding == null ? activity : activityPluginBinding.getActivity();
    }

    @Override
    public Context context() {
        return binding.getApplicationContext();
    }

    @Override
    public Context activeContext() {
        return binding.getApplicationContext();
    }

    @Override
    public BinaryMessenger messenger() {
        return binding.getBinaryMessenger();
    }

    @Override
    public TextureRegistry textures() {
        return binding.getTextureRegistry();
    }

    @Override
    public PlatformViewRegistry platformViewRegistry() {
        return binding.getPlatformViewRegistry();
    }

    @Override
    public FlutterView view() {
        return null;
    }

    @Override
    public String lookupKeyForAsset(String asset) {
        return binding.getFlutterAssets().getAssetFilePathByName(asset);
    }

    @Override
    public String lookupKeyForAsset(String asset, String packageName) {
        return binding.getFlutterAssets().getAssetFilePathByName(asset, packageName);
    }

    @Override
    public PluginRegistry.Registrar publish(Object value) {
        return null;
    }

    @Override
    public PluginRegistry.Registrar addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener listener) {
        return null;
    }

    @Override
    public PluginRegistry.Registrar addActivityResultListener(PluginRegistry.ActivityResultListener listener) {
        return null;
    }

    @Override
    public PluginRegistry.Registrar addNewIntentListener(PluginRegistry.NewIntentListener listener) {
        return null;
    }

    @Override
    public PluginRegistry.Registrar addUserLeaveHintListener(PluginRegistry.UserLeaveHintListener listener) {
        return null;
    }

    @Override
    public PluginRegistry.Registrar addViewDestroyListener(PluginRegistry.ViewDestroyListener listener) {
        return null;
    }
}
