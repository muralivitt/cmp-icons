package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ProfileCircle: ImageVector
    get() {
        if (_ProfileCircle != null) {
            return _ProfileCircle!!
        }
        _ProfileCircle = ImageVector.Builder(
            name = "ProfileCircle",
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
                moveTo(12.12f, 12.78f)
                curveTo(12.05f, 12.77f, 11.96f, 12.77f, 11.88f, 12.78f)
                curveTo(10.12f, 12.72f, 8.72f, 11.28f, 8.72f, 9.51f)
                curveTo(8.72f, 7.7f, 10.18f, 6.23f, 12f, 6.23f)
                curveTo(13.81f, 6.23f, 15.28f, 7.7f, 15.28f, 9.51f)
                curveTo(15.27f, 11.28f, 13.88f, 12.72f, 12.12f, 12.78f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.74f, 19.38f)
                curveTo(16.96f, 21.01f, 14.6f, 22f, 12f, 22f)
                curveTo(9.4f, 22f, 7.04f, 21.01f, 5.26f, 19.38f)
                curveTo(5.36f, 18.44f, 5.96f, 17.52f, 7.03f, 16.8f)
                curveTo(9.77f, 14.98f, 14.25f, 14.98f, 16.97f, 16.8f)
                curveTo(18.04f, 17.52f, 18.64f, 18.44f, 18.74f, 19.38f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _ProfileCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileCircle: ImageVector? = null
