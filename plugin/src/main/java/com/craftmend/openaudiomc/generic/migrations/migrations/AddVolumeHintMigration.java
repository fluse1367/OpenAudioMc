package com.craftmend.openaudiomc.generic.migrations.migrations;

import com.craftmend.openaudiomc.OpenAudioMc;
import com.craftmend.openaudiomc.generic.migrations.interfaces.SimpleMigration;
import com.craftmend.openaudiomc.generic.storage.enums.StorageKey;
import com.craftmend.openaudiomc.generic.storage.interfaces.ConfigurationImplementation;

public class AddVolumeHintMigration extends SimpleMigration {

    @Override
    public boolean shouldBeRun() {
        ConfigurationImplementation config = OpenAudioMc.getInstance().getConfiguration();
        return !config.hasStorageKey(StorageKey.MESSAGE_CLIENT_VOLUME);
    }

    @Override
    public void execute() {
        migrateFilesFromResources();
    }
}
