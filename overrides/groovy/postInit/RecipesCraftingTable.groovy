// Sand to dust using GT Hammer
crafting.addShapeless(item('gbcore:blockdust'), [item('gregtech:hammer'), item('minecraft:sand')])

// ULV Burner Generator
crafting.addShaped(item('gregtech:machine:4000'), [
    [item('gregtech:meta_plate:335'), item('minecraft:furnace'), item('gregtech:meta_plate:335')],
    [item('gregtech:meta_plate:335'), item('gregtech:machine_casing'), item('gregtech:meta_plate:335')],
    [item('gregtech:meta_plate:335'), item('minecraft:furnace'), item('gregtech:meta_plate:335')]
])

// ULV Sifter
crafting.addShaped(item('gregtech:machine:4001'), [
    [item('gregtech:meta_plate:335'), item('minecraft:string'), item('gregtech:meta_plate:335')],
    [item('gregtech:meta_plate:335'), item('gregtech:machine_casing'), item('gregtech:meta_plate:335')],
    [item('gregtech:meta_plate:335'), item('minecraft:string'), item('gregtech:meta_plate:335')]
])

// Change Auto-maintenance hatch to late game tier
crafting.replaceShaped(item('gregtech:machine:1656'), [
    [ore('circuitUv'), item('gregtech:machine:1654'), ore('circuitUv')], 
    [item('gregtech:meta_item_1:194'), item('gregtech:machine:993'), item('gregtech:meta_item_1:194')], 
    [ore('circuitUv'), item('gregtech:machine:1654'), ore('circuitUv')]
])

// Change Endervoir to be cheaper
crafting.replaceShaped(item('enderio:block_reservoir') * 4, [
    [ore('plateIron'), item('minecraft:glass'), ore('plateIron')], 
    [item('minecraft:glass'), item('minecraft:water_bucket'), item('minecraft:glass')], 
    [ore('plateIron'), item('minecraft:glass'), ore('plateIron')]
])

// Make Farming Station an LV machine technically
crafting.replaceShaped(item('enderio:block_farm_station'), [
    [ore('circuitLv'), item('minecraft:shears'), ore('circuitLv')], 
    [item('minecraft:iron_axe'), item('gregtech:machine:986'), item('minecraft:iron_hoe')], 
    [ore('circuitLv'), item('minecraft:dirt'), ore('circuitLv')]
])

// RAAA HARDER ENDER IO BASIC CAPACITOR CAUSE FUCK
crafting.replaceShaped(item('enderio:item_basic_capacitor'), [
    [ore('circuitLv'), item('gregtech:meta_nugget:32004'), ore('circuitLv')], 
    [item('gregtech:meta_nugget:32004'), metaitem('dustSilicon'), item('gregtech:meta_nugget:32004')], 
    [ore('circuitLv'), item('gregtech:meta_nugget:32004'), ore('circuitLv')]
])

// RAAA HARDER ENDER IO DOUBLE LAYER CAPACITOR CAUSE FUCK
crafting.replaceShaped(item('enderio:item_basic_capacitor:1'), [
    [ore('circuitMv'), item('gregtech:meta_nugget:32006'), ore('circuitMv')], 
    [item('gregtech:meta_nugget:32006'), item('enderio:item_basic_capacitor'), item('gregtech:meta_nugget:32006')], 
    [ore('circuitMv'), item('gregtech:meta_nugget:32006'), ore('circuitMv')]
])

// RAAA HARDER ENDER IO OCTADIC CAPACITOR CAUSE FUCK
crafting.replaceShaped(item('enderio:item_basic_capacitor:2'), [
    [ore('circuitHv'), item('gregtech:meta_nugget:32007'), ore('circuitHv')], 
    [item('gregtech:meta_nugget:32007'), item('enderio:item_basic_capacitor:1'), item('gregtech:meta_nugget:32007')], 
    [ore('circuitHv'), item('gregtech:meta_nugget:32007'), ore('circuitHv')]
])