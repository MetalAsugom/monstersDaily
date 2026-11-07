package com.example.monsterdays.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.monsterdays.R

data class Monster(
    @param:DrawableRes val imageResourceId: Int,
    @param:StringRes val name: Int,
    @param:StringRes val description: Int,
)

val monsters = listOf(
    Monster(R.drawable.fatalis, R.string.fatalis, R.string.fatalisDescription),
    Monster(R.drawable.mh3u_render_lagiacrus_marm_3freo, R.string.lagiacrus, R.string.lagiacrusDescription),
    Monster(R.drawable.mh4_render_brachydios, R.string.brachydios, R.string.brachydiosDescription),
    Monster(R.drawable.mh4_render_gran_jaggi, R.string.great_jaggi, R.string.great_jaggiDescription),
    Monster(R.drawable.mh4u_render_dalamadur, R.string.dalamadur, R.string.dalamadurDescription),
    Monster(R.drawable.mhgen_render_bulldrome, R.string.bulldrome, R.string.bulldromeDescription),
    Monster(R.drawable.mhoutlanders_ruger_aidal_render_001, R.string.ruger_aidal, R.string.ruger_aidalDescription),
    Monster(R.drawable.mhrise_render_barroth, R.string.barroth, R.string.barrothDescription),
    Monster(R.drawable.mhrise_render_rathalos, R.string.rathalos, R.string.rathalosDescription),
    Monster(R.drawable.mhrise_render_teostra, R.string.teostra, R.string.teostraDescription),
    Monster(R.drawable.mhrs_lucent_nargacuga_render_001, R.string.lucent_nargacuga, R.string.lucent_nargacugaDescription),
    Monster(R.drawable.mhrs_render_lunagaron_002, R.string.lunagaron, R.string.lunagaronDescription),
    Monster(R.drawable.mhrs_render_malzeno_001, R.string.malzeno, R.string.malzenoDescription),
    Monster(R.drawable.mhrs_render_mizutsune_violeta, R.string.mizutsune_violet, R.string.mizutsune_violetDescription),
    Monster(R.drawable.mhrs_render_valstrax_carmes_3f_elevado, R.string.valstrax, R.string.valstraxDescription),
    Monster(R.drawable.mhrs_render_velkhana, R.string.velkhana, R.string.velkhanaDescription),
    Monster(R.drawable.mhw_render_deviljho, R.string.deviljho, R.string.deviljhoDescription),
    Monster(R.drawable.mhw_render_gran_jagras_001, R.string.great_jagras, R.string.great_jagrasDescription),
    Monster(R.drawable.mhw_render_nergigante_001, R.string.nergigante, R.string.nergiganteDescription),
    Monster(R.drawable.mhw_render_odogaron, R.string.odogaron, R.string.odogaronDescription),
    Monster(R.drawable.mhwi_render_alatreon, R.string.alatreon, R.string.alatreonDescription),
    Monster(R.drawable.mhwi_render_glavenus, R.string.glavenus, R.string.glavenusDescription),
    Monster(R.drawable.mhwi_render_namielle, R.string.namielle, R.string.namielleDescription),
    Monster(R.drawable.mhwi_render_yian_garuga, R.string.yian_garuga, R.string.yian_garugaDescription),
    Monster(R.drawable.mhwi_render_zinogre_estigio, R.string.zinogre, R.string.zinogreDescription),
    Monster(R.drawable.mhwilds_render_arkveld_001, R.string.arkveld, R.string.arkveldDescription),
    Monster(R.drawable.mhwilds_render_gore_magala, R.string.gore_magala, R.string.gore_magalaDescription),
    Monster(R.drawable.mhwilds_render_mizutsune, R.string.mizutsune, R.string.mizutsuneDescription),
    Monster(R.drawable.mhwilds_render_rey_dau, R.string.rey_dau, R.string.rey_dauDescription),
)
