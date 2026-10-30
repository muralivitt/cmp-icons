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

val VuesaxIconsTwotone.FilterAdd: ImageVector
    get() {
        if (_FilterAdd != null) {
            return _FilterAdd!!
        }
        _FilterAdd = ImageVector.Builder(
            name = "FilterAdd",
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
                curveTo(21.631f, 15.64f, 21.381f, 16.48f, 20.941f, 17.2f)
                curveTo(20.121f, 18.58f, 18.611f, 19.5f, 16.881f, 19.5f)
                curveTo(15.151f, 19.5f, 13.641f, 18.57f, 12.821f, 17.2f)
                curveTo(12.381f, 16.49f, 12.131f, 15.64f, 12.131f, 14.75f)
                curveTo(12.131f, 12.13f, 14.261f, 10f, 16.881f, 10f)
                curveTo(19.501f, 10f, 21.631f, 12.13f, 21.631f, 14.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.659f, 14.73f)
                horizontalLineTo(15.109f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.879f, 13f)
                verticalLineTo(16.55f)
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
                curveTo(17.59f, 10.04f, 17.24f, 10f, 16.881f, 10f)
                curveTo(14.26f, 10f, 12.13f, 12.13f, 12.13f, 14.75f)
                curveTo(12.13f, 15.64f, 12.38f, 16.48f, 12.821f, 17.2f)
                curveTo(13.191f, 17.82f, 13.7f, 18.35f, 14.321f, 18.73f)
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

        return _FilterAdd!!
    }

@Suppress("ObjectPropertyName")
private var _FilterAdd: ImageVector? = null
