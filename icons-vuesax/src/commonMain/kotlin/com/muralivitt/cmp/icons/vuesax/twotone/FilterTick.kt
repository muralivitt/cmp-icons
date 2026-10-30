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

val VuesaxIconsTwotone.FilterTick: ImageVector
    get() {
        if (_FilterTick != null) {
            return _FilterTick!!
        }
        _FilterTick = ImageVector.Builder(
            name = "FilterTick",
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
                moveTo(21.631f, 14.75f)
                curveTo(21.631f, 15.64f, 21.391f, 16.48f, 20.951f, 17.2f)
                curveTo(20.131f, 18.57f, 18.621f, 19.5f, 16.881f, 19.5f)
                curveTo(15.941f, 19.5f, 15.061f, 19.22f, 14.321f, 18.73f)
                curveTo(13.701f, 18.35f, 13.191f, 17.82f, 12.821f, 17.2f)
                curveTo(12.381f, 16.48f, 12.131f, 15.64f, 12.131f, 14.75f)
                curveTo(12.131f, 12.13f, 14.261f, 10f, 16.881f, 10f)
                curveTo(17.241f, 10f, 17.591f, 10.04f, 17.921f, 10.12f)
                curveTo(20.051f, 10.59f, 21.631f, 12.49f, 21.631f, 14.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.029f, 14.75f)
                lineTo(16.199f, 15.92f)
                lineTo(18.729f, 13.58f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.691f, 4.02f)
                verticalLineTo(6.24f)
                curveTo(20.691f, 7.05f, 20.181f, 8.06f, 19.681f, 8.57f)
                lineTo(17.92f, 10.12f)
                curveTo(17.59f, 10.04f, 17.241f, 10f, 16.881f, 10f)
                curveTo(14.261f, 10f, 12.131f, 12.13f, 12.131f, 14.75f)
                curveTo(12.131f, 15.64f, 12.381f, 16.48f, 12.821f, 17.2f)
                curveTo(13.191f, 17.82f, 13.701f, 18.35f, 14.321f, 18.73f)
                verticalLineTo(19.07f)
                curveTo(14.321f, 19.68f, 13.92f, 20.49f, 13.41f, 20.79f)
                lineTo(12f, 21.7f)
                curveTo(10.691f, 22.51f, 8.871f, 21.6f, 8.871f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.871f, 13.92f, 8.461f, 13.01f, 8.061f, 12.51f)
                lineTo(4.221f, 8.47f)
                curveTo(3.721f, 7.96f, 3.311f, 7.05f, 3.311f, 6.45f)
                verticalLineTo(4.12f)
                curveTo(3.311f, 2.91f, 4.221f, 2f, 5.331f, 2f)
                horizontalLineTo(18.67f)
                curveTo(19.781f, 2f, 20.691f, 2.91f, 20.691f, 4.02f)
                close()
            }
        }.build()

        return _FilterTick!!
    }

@Suppress("ObjectPropertyName")
private var _FilterTick: ImageVector? = null
