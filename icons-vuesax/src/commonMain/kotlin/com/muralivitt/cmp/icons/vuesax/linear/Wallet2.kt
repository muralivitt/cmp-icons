package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Wallet2: ImageVector
    get() {
        if (_Wallet2 != null) {
            return _Wallet2!!
        }
        _Wallet2 = ImageVector.Builder(
            name = "Wallet2",
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
                moveTo(13f, 9f)
                horizontalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10.97f)
                verticalLineTo(13.03f)
                curveTo(22f, 13.58f, 21.56f, 14.03f, 21f, 14.05f)
                horizontalLineTo(19.04f)
                curveTo(17.96f, 14.05f, 16.97f, 13.26f, 16.88f, 12.18f)
                curveTo(16.82f, 11.55f, 17.06f, 10.96f, 17.48f, 10.55f)
                curveTo(17.85f, 10.17f, 18.36f, 9.95f, 18.92f, 9.95f)
                horizontalLineTo(21f)
                curveTo(21.56f, 9.97f, 22f, 10.42f, 22f, 10.97f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.48f, 10.55f)
                curveTo(17.06f, 10.96f, 16.82f, 11.55f, 16.88f, 12.18f)
                curveTo(16.97f, 13.26f, 17.96f, 14.05f, 19.04f, 14.05f)
                horizontalLineTo(21f)
                verticalLineTo(15.5f)
                curveTo(21f, 18.5f, 19f, 20.5f, 16f, 20.5f)
                horizontalLineTo(7f)
                curveTo(4f, 20.5f, 2f, 18.5f, 2f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2f, 5.78f, 3.64f, 3.88f, 6.19f, 3.56f)
                curveTo(6.45f, 3.52f, 6.72f, 3.5f, 7f, 3.5f)
                horizontalLineTo(16f)
                curveTo(16.26f, 3.5f, 16.51f, 3.51f, 16.75f, 3.55f)
                curveTo(19.33f, 3.85f, 21f, 5.76f, 21f, 8.5f)
                verticalLineTo(9.95f)
                horizontalLineTo(18.92f)
                curveTo(18.36f, 9.95f, 17.85f, 10.17f, 17.48f, 10.55f)
                close()
            }
        }.build()

        return _Wallet2!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet2: ImageVector? = null
