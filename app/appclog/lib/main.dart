import 'package:flame/game.dart';
import 'package:flame/util.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';


void main() async {
  Util flameUtil = Util();
  await flameUtil.fullScreen();
  await flameUtil.setOrientation(DeviceOrientation.portraitDown);

  BoxGame boxGame = new BoxGame();
  runApp(boxGame.widget);
}

class BoxGame extends Game{

  Size screenSize;
  Paint bgPain = Paint();

  @override
  void render(Canvas canvas) {
    // TODO: implement render
    Rect bgRect = Rect.fromLTWH(0, 0, this.screenSize.width, this.screenSize.height);
    bgPain.color = Colors.white;
    canvas.drawRect(bgRect, bgPain);
  }

  @override
  void update(double t) {
    // TODO: implement update
  }

  @override
  void resize(Size size) {
    // TODO: implement resize
    this.screenSize = size;
    super.resize(size);
  }

}
