import gregtech.api.unification.material.Materials
import gregtech.api.unification.ore.OrePrefix

// Flint * 1
mods.gregtech.sifter.removeByInput(16, [item('minecraft:gravel')], null)

mods.gregtech.sifter.recipeBuilder()
                .inputs(item('minecraft:gravel'))
                .outputs(item('minecraft:flint'))
                .chancedOutput(OrePrefix.crushed, Materials.Iron, 9000, 100)
                .chancedOutput(OrePrefix.crushed, Materials.Copper, 6000, 100)
                .chancedOutput(OrePrefix.crushed, Materials.Tin, 3000, 100)
                .chancedOutput(OrePrefix.crushed, Materials.Silver, 1500, 100)
                .chancedOutput(OrePrefix.crushed, Materials.Redstone, 750, 100)
                .EUt(8)
                .duration(100)
                .buildAndRegister()

mods.gregtech.sifter.recipeBuilder()
                .inputs(item('minecraft:sand'))
                .output(OrePrefix.dust, Materials.QuartzSand)
                .chancedOutput(OrePrefix.dust, Materials.Glowstone, 9000, 100)
                .chancedOutput(OrePrefix.dust, Materials.Redstone, 6000, 100)
                .chancedOutput(OrePrefix.dust, Materials.CertusQuartz, 3000, 100)
                .chancedOutput(OrePrefix.dust, Materials.Sulfur, 1500, 100)
                .chancedOutput(OrePrefix.dust, Materials.Gallium, 750, 100)
                .EUt(8)
                .duration(100)
                .buildAndRegister()