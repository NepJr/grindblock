import gregtech.api.unification.material.Materials
import gregtech.api.unification.material.Material
import gregtech.api.unification.ore.OrePrefix

def recipeMap = mods.gregtech.mixer

// Enderium Dust
recipeMap.recipeBuilder()
    .input(OrePrefix.dust, Materials.Lead, 6)
    .input(OrePrefix.dust, Materials.Platinum, 3)
    .input(OrePrefix.dust, Materials.EnderPearl, 3)
    .outputs(item('gregtech:meta_dust:32001') * 9)
    .EUt(1920)
    .duration(2000)
    .buildAndRegister()

recipeMap.recipeBuilder()
    .input(OrePrefix.dust, Materials.Stone, 6)
    .input(OrePrefix.dust, Materials.Flint, 3)
    .input(OrePrefix.dust, Materials.QuartzSand, 3)
    .input(OrePrefix.dust, Materials.Clay, 3)
    .fluidInputs(liquid('water') * 4000)
    .fluidOutputs(liquid('silty_water') * 4000)
    .EUt(16)
    .duration(2000)
    .buildAndRegister()

recipeMap.recipeBuilder()
    .input(OrePrefix.dust, Materials.Gold, 3)
    .input(OrePrefix.dust, Materials.Redstone, 3)
    .input(OrePrefix.dust, Materials.Glowstone, 3)
    .outputs(item('gregtech:meta_dust:32006'))
    .EUt(120)
    .duration(200)
    .buildAndRegister()

recipeMap.recipeBuilder()
    .inputs(item('gregtech:meta_dust:32006'))
    .input(OrePrefix.dust, Materials.EnderPearl, 1)
    .outputs(item('gregtech:meta_dust:32007'))
    .EUt(480)
    .duration(200)
    .buildAndRegister()