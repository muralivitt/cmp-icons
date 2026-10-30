package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Star1: ImageVector
    get() {
        if (_Star1 != null) {
            return _Star1!!
        }
        _Star1 = ImageVector.Builder(
            name = "Star1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.731f, 3.51f)
                lineTo(15.491f, 7.03f)
                curveTo(15.731f, 7.52f, 16.371f, 7.99f, 16.911f, 8.08f)
                lineTo(20.101f, 8.61f)
                curveTo(22.141f, 8.95f, 22.621f, 10.43f, 21.151f, 11.89f)
                lineTo(18.671f, 14.37f)
                curveTo(18.251f, 14.79f, 18.021f, 15.6f, 18.151f, 16.18f)
                lineTo(18.861f, 19.25f)
                curveTo(19.421f, 21.68f, 18.131f, 22.62f, 15.981f, 21.35f)
                lineTo(12.991f, 19.58f)
                curveTo(12.451f, 19.26f, 11.561f, 19.26f, 11.011f, 19.58f)
                lineTo(8.021f, 21.35f)
                curveTo(5.881f, 22.62f, 4.581f, 21.67f, 5.141f, 19.25f)
                lineTo(5.851f, 16.18f)
                curveTo(5.981f, 15.6f, 5.751f, 14.79f, 5.331f, 14.37f)
                lineTo(2.851f, 11.89f)
                curveTo(1.391f, 10.43f, 1.861f, 8.95f, 3.901f, 8.61f)
                lineTo(7.091f, 8.08f)
                curveTo(7.621f, 7.99f, 8.261f, 7.52f, 8.501f, 7.03f)
                lineTo(10.261f, 3.51f)
                curveTo(11.221f, 1.6f, 12.781f, 1.6f, 13.731f, 3.51f)
                close()
            }
        }.build()

        return _Star1!!
    }

@Suppress("ObjectPropertyName")
private var _Star1: ImageVector? = null
