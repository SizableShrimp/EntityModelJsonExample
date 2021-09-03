package me.sizableshrimp.entitymodeljsonexample;

import me.sizableshrimp.entitymodeljson.datagen.EntityModelProvider;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ExampleEntityModelProvider extends EntityModelProvider {
    public ExampleEntityModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, EntityModelJsonExampleMod.MODID, existingFileHelper);
    }

    @Override
    public void registerEntityModels() {
        getBuilder(mcLayerLoc("cat", "main"))
                .overwrite(false)
                .child("head")
                .cubes(cubes -> cubes.texOffs(4, 7).addBox(1, 2, 3, 4, 5, 6))
                .child("nose")
                .end()
                .child("ear")
                .cubes(cubes -> cubes.mirror().addBox(7,8,9,10,11,12))
                .pose(PartPose.offset(1, 2, 3))
                .end()
                .end();
    }
}
