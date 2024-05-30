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