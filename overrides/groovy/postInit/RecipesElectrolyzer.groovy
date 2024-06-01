import gregtech.api.unification.material.Materials
import gregtech.api.unification.material.Material
import gregtech.api.unification.ore.OrePrefix

def recipeMap = mods.gregtech.electrolyzer

recipeMap.recipeBuilder()
    .fluidInputs(liquid('silty_water') * 1000)
    .outputs(item('gregtech:meta_dust:32003'))
    .fluidOutputs(liquid('salt_water') * 1000)
    .EUt(30)
    .duration(1500)
    .buildAndRegister()

recipeMap.recipeBuilder()
    .inputs(item('gregtech:meta_dust:32003'))
    .chancedOutput(OrePrefix.dust, Materials.Lead, 2000, 1000)
    .chancedOutput(OrePrefix.dust, Materials.Nickel, 1000, 1000)
    .chancedOutput(OrePrefix.dust, Materials.Manganese, 750, 1000)
    .chancedOutput(OrePrefix.dust, Materials.Cobaltite, 500, 1000)
    .chancedOutput(OrePrefix.dust, Materials.Graphite, 250, 1000)
    .chancedOutput(OrePrefix.dust, Materials.Sphalerite, 100, 1000)
    .EUt(30)
    .duration(1000)
    .buildAndRegister()
