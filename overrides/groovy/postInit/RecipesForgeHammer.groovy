import gregtech.api.unification.material.Materials
import gregtech.api.unification.material.Material
import gregtech.api.unification.ore.OrePrefix

def recipeMap = mods.gregtech.forge_hammer

recipeMap.recipeBuilder()
    .inputs(item('minecraft:sand'))
    .outputs(item('gbcore:blockdust'))
    .EUt(16)
    .duration(10)
    .buildAndRegister()