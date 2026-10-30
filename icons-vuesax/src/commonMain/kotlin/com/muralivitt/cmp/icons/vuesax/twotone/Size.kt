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

val VuesaxIconsTwotone.Size: ImageVector
    get() {
        if (_Size != null) {
            return _Size!!
        }
        _Size = ImageVector.Builder(
            name = "Size",
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
                moveTo(16.971f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(16.971f, 20.5f, 15.471f, 22f, 11.721f, 22f)
                horizontalLineTo(7.221f)
                curveTo(3.471f, 22f, 1.971f, 20.5f, 1.971f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.971f, 8.5f, 3.471f, 7f, 7.221f, 7f)
                horizontalLineTo(11.721f)
                curveTo(15.471f, 7f, 16.971f, 8.5f, 16.971f, 12.25f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.971f, 5.85f)
                verticalLineTo(9.15f)
                curveTo(21.971f, 11.9f, 20.871f, 13f, 18.121f, 13f)
                horizontalLineTo(16.971f)
                verticalLineTo(12.25f)
                curveTo(16.971f, 8.5f, 15.471f, 7f, 11.721f, 7f)
                horizontalLineTo(10.971f)
                verticalLineTo(5.85f)
                curveTo(10.971f, 3.1f, 12.071f, 2f, 14.821f, 2f)
                horizontalLineTo(18.121f)
                curveTo(20.871f, 2f, 21.971f, 3.1f, 21.971f, 5.85f)
                close()
            }
        }.build()

        return _Size!!
    }

@Suppress("ObjectPropertyName")
private var _Size: ImageVector? = null
