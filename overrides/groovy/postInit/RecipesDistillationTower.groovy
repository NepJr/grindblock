def recipeMap = mods.gregtech.distillation_tower

recipeMap.recipeBuilder()
            .fluidInputs(fluid('void_gas') * 4000)
            .fluidOutputs(fluid('oil_heavy') * 100, fluid('oil_light') * 200, fluid('natural_gas') * 350, fluid('salt_water') * 2000, fluid('oil') * 500, fluid('oil_medium') * 250)
            .EUt(32)
            .duration(1200)
            .buildAndRegister()