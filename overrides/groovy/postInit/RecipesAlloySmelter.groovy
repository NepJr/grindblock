import gregtech.api.unification.material.Materials
import gregtech.api.unification.material.Material
import gregtech.api.unification.ore.OrePrefix

def recipeMap = mods.gregtech.alloy_smelter

recipeMap.recipeBuilder()
        .input(OrePrefix.ingot, Materials.Iron)
        .input(OrePrefix.Gem, Materials.EnderPearl)
        .outputs(item('gregtech:meta_ingot:32004'))
        .EUt(7)
        .duration(200)
        .buildAndRegister()

recipeMap.recipeBuilder()
        .input(OrePrefix.ingot, Materials.Iron)
        .input(OrePrefix.dust, Materials.Redstone)
        .outputs(item('gregtech:meta_ingot:32005'))
        .EUt(7)
        .duration(200)
        .buildAndRegister()

