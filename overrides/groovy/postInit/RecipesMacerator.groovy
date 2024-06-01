import gregtech.api.unification.material.Materials
import gregtech.api.unification.ore.OrePrefix

def recipeMap = mods.gregtech.macerator

recipeMap.recipeBuilder()
            .inputs(item('gbcore:blockdust'))
            .chancedOutput(OrePrefix.gem, Materials.Diamond, 500, 0)
            .EUt(8)
            .duration(100)
            .buildAndRegister()