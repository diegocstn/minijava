/* MiniJavaLexerTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. MiniJavaLexerTokenManager.java */
package com.diegocostantino.minijava.lexer;

/** Token Manager. */
@SuppressWarnings("unused")public class MiniJavaLexerTokenManager implements MiniJavaLexerConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x40000L) != 0L)
            return 0;
         if ((active0 & 0xc00L) != 0L)
            return 8;
         if ((active0 & 0x7fffe000000L) != 0L)
         {
            jjmatchedKind = 46;
            return 8;
         }
         return -1;
      case 1:
         if ((active0 & 0x80000000L) != 0L)
            return 8;
         if ((active0 & 0x7ff7e000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 1;
            return 8;
         }
         return -1;
      case 2:
         if ((active0 & 0x1400000000L) != 0L)
            return 8;
         if ((active0 & 0x7eb7e000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 2;
            return 8;
         }
         return -1;
      case 3:
         if ((active0 & 0x138000000L) != 0L)
            return 8;
         if ((active0 & 0x7ea46000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 3;
            return 8;
         }
         return -1;
      case 4:
         if ((active0 & 0x242000000L) != 0L)
            return 8;
         if ((active0 & 0x7e804000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 4;
            return 8;
         }
         return -1;
      case 5:
         if ((active0 & 0x50804000000L) != 0L)
            return 8;
         if ((active0 & 0x2e000000000L) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return 8;
         }
         return -1;
      case 6:
         if ((active0 & 0x2a000000000L) != 0L)
            return 8;
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 13:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 14:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 15:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 16:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 17:
         if ((active0 & 0x4000000000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 19);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 40:
         return jjStopAtPos(0, 6);
      case 41:
         return jjStopAtPos(0, 7);
      case 42:
         return jjStopAtPos(0, 17);
      case 43:
         return jjStopAtPos(0, 15);
      case 44:
         return jjStopAtPos(0, 12);
      case 45:
         return jjStopAtPos(0, 16);
      case 46:
         return jjStopAtPos(0, 14);
      case 47:
         return jjStartNfaWithStates_0(0, 18, 0);
      case 59:
         return jjStopAtPos(0, 13);
      case 60:
         return jjStopAtPos(0, 20);
      case 61:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 62:
         return jjStopAtPos(0, 21);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 91:
         return jjStartNfaWithStates_0(0, 10, 8);
      case 93:
         return jjStartNfaWithStates_0(0, 11, 8);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x8100000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1080000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x70000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x30000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 123:
         return jjStopAtPos(0, 8);
      case 125:
         return jjStopAtPos(0, 9);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         break;
      case 61:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00000000L);
      case 102:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 8);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x210000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x102000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2008000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x20020000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x50000000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x6000000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x50000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x20218000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x4100000000L);
      case 116:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 8);
         return jjMoveStringLiteralDfa3_0(active0, 0x8800000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 119:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 27, 8);
         break;
      case 101:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 8);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 8);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x52200000000L);
      case 115:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 8);
         return jjMoveStringLiteralDfa4_0(active0, 0x42000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x4004000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L);
      case 101:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 8);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 8);
         return jjMoveStringLiteralDfa5_0(active0, 0x6000000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x50004000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      case 115:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000000L);
      case 99:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 26, 8);
         else if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000L);
      case 110:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(5, 35, 8);
         break;
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000000L);
      case 46:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000L);
      case 101:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 41, 8);
         break;
      case 110:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 37, 8);
         break;
      case 115:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 39, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000000L);
      case 115:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000000000L);
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000000000L);
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa11_0(active0, 0x4000000000L);
      case 116:
         return jjMoveStringLiteralDfa11_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x40000000000L);
      case 112:
         return jjMoveStringLiteralDfa12_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa13_0(active0, 0x40000000000L);
      case 114:
         return jjMoveStringLiteralDfa13_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa14_0(active0, 0x40000000000L);
      case 105:
         return jjMoveStringLiteralDfa14_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa15_0(active0, 0x4000000000L);
      case 118:
         return jjMoveStringLiteralDfa15_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa16_0(active0, 0x40000000000L);
      case 116:
         return jjMoveStringLiteralDfa16_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
private int jjMoveStringLiteralDfa16_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa17_0(active0, 0x40000000000L);
      case 108:
         return jjMoveStringLiteralDfa17_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
private int jjMoveStringLiteralDfa17_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa18_0(active0, 0x40000000000L);
      case 110:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(17, 38);
         break;
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
private int jjMoveStringLiteralDfa18_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(16, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(17, active0);
      return 18;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa19_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(17, active0);
}
private int jjMoveStringLiteralDfa19_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(17, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(18, active0);
      return 19;
   }
   switch(curChar)
   {
      case 109:
         return jjMoveStringLiteralDfa20_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(18, active0);
}
private int jjMoveStringLiteralDfa20_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(18, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(19, active0);
      return 20;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa21_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(19, active0);
}
private int jjMoveStringLiteralDfa21_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(19, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(20, active0);
      return 21;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa22_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(20, active0);
}
private int jjMoveStringLiteralDfa22_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(20, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(21, active0);
      return 22;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa23_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(21, active0);
}
private int jjMoveStringLiteralDfa23_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(21, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(22, active0);
      return 23;
   }
   switch(curChar)
   {
      case 40:
         return jjMoveStringLiteralDfa24_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(22, active0);
}
private int jjMoveStringLiteralDfa24_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(22, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(23, active0);
      return 24;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa25_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(23, active0);
}
private int jjMoveStringLiteralDfa25_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(23, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(24, active0);
      return 25;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa26_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(24, active0);
}
private int jjMoveStringLiteralDfa26_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(24, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(25, active0);
      return 26;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa27_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(25, active0);
}
private int jjMoveStringLiteralDfa27_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(25, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(26, active0);
      return 27;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa28_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(26, active0);
}
private int jjMoveStringLiteralDfa28_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(26, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(27, active0);
      return 28;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa29_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(27, active0);
}
private int jjMoveStringLiteralDfa29_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(27, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(28, active0);
      return 29;
   }
   switch(curChar)
   {
      case 103:
         return jjMoveStringLiteralDfa30_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(28, active0);
}
private int jjMoveStringLiteralDfa30_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(28, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(29, active0);
      return 30;
   }
   switch(curChar)
   {
      case 91:
         return jjMoveStringLiteralDfa31_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(29, active0);
}
private int jjMoveStringLiteralDfa31_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(29, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(30, active0);
      return 31;
   }
   switch(curChar)
   {
      case 93:
         return jjMoveStringLiteralDfa32_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(30, active0);
}
private int jjMoveStringLiteralDfa32_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(30, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(31, active0);
      return 32;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa33_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(31, active0);
}
private int jjMoveStringLiteralDfa33_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(31, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(32, active0);
      return 33;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa34_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(32, active0);
}
private int jjMoveStringLiteralDfa34_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(32, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(33, active0);
      return 34;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa35_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(33, active0);
}
private int jjMoveStringLiteralDfa35_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(33, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(34, active0);
      return 35;
   }
   switch(curChar)
   {
      case 103:
         return jjMoveStringLiteralDfa36_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(34, active0);
}
private int jjMoveStringLiteralDfa36_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(34, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(35, active0);
      return 36;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa37_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(35, active0);
}
private int jjMoveStringLiteralDfa37_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(35, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(36, active0);
      return 37;
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(37, 42);
         break;
      default :
         break;
   }
   return jjStartNfa_0(36, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 9;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     { jjCheckNAdd(5); }
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 45)
                        kind = 45;
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 47)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 1:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 10)
                     kind = 5;
                  break;
               case 4:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  { jjCheckNAdd(5); }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  { jjCheckNAdd(5); }
                  break;
               case 6:
                  if (curChar == 48 && kind > 45)
                     kind = 45;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
               case 8:
                  if ((0x7fffffffffffffeL & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  { jjCheckNAdd(8); }
                  break;
               case 1:
                  { jjAddStates(0, 1); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 1); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 9 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 2, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\50", "\51", "\173", "\175", "\133", 
"\135", "\54", "\73", "\56", "\53", "\55", "\52", "\57", "\41", "\74", "\76", 
"\46\46", "\75", "\75\75", "\143\154\141\163\163", "\163\164\141\164\151\143", 
"\166\157\151\144", "\164\150\151\163", "\164\162\165\145", "\146\141\154\163\145", "\151\146", 
"\145\154\163\145", "\167\150\151\154\145", "\156\145\167", "\162\145\164\165\162\156", 
"\151\156\164", "\142\157\157\154\145\141\156", 
"\123\171\163\164\145\155\56\157\165\164\56\160\162\151\156\164\154\156", "\145\170\164\145\156\144\163", "\160\165\142\154\151\143", 
"\160\162\151\166\141\164\145", 
"\160\165\142\154\151\143\40\163\164\141\164\151\143\40\166\157\151\144\40\155\141\151\156\50\123\164\162\151\156\147\133\135\40\141\162\147\163\51", null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public MiniJavaLexerTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public MiniJavaLexerTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 9; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x67ffffffffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[9];
    private final int[] jjstateSet = new int[2 * 9];

    
    protected char curChar;
}
