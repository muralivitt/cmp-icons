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

val VuesaxIconsTwotone.Record: ImageVector
    get() {
        if (_Record != null) {
            return _Record!!
        }
        _Record = ImageVector.Builder(
            name = "Record",
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
                moveTo(12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                close()
            }
        }.build()

        return _Record!!
    }

@Suppress("ObjectPropertyName")
private var _Record: ImageVector? = null
