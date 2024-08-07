����   B �
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  &com/ecommerce/models/ElectronicProduct  Laptop@�@     
     (Ljava/lang/String;DZ)V  
Headphones@I         com/ecommerce/models/Cart
  	 
 # $ % out Ljava/io/PrintStream; ' 1. Display Products
 ) * + , - java/io/PrintStream println (Ljava/lang/String;)V / 2. Add Product to Cart 1 3. View Cart 3 4. Update Quantity 5 5. Remove Product from Cart 7 6. Calculate Total Bill 9 7. Apply Discount ; 8. Exit = Choose an option: 
 ) ? @ - print
  B C D nextInt ()I F com/ecommerce/models/Product
 H I J K L com/ecommerce/ECommerceApp displayProducts "([Lcom/ecommerce/models/Product;)V
 H N O P addProductToCart m(Lcom/ecommerce/models/Cart;Lcom/ecommerce/models/Product;Lcom/ecommerce/models/Product;Ljava/util/Scanner;)V
  R S  displayCart
 H U V W updateQuantity 1(Lcom/ecommerce/models/Cart;Ljava/util/Scanner;)V
 H Y Z W removeProductFromCart
  \ ] ^ calculateTotalBill ()D   ` a b makeConcatWithConstants (D)Ljava/lang/String;
 H d e W applyDiscount
 
 g h i exit (I)V k !Invalid choice. Please try again.
 ) m , n (Ljava/lang/Object;)V p Enter product name: 
  r s t next ()Ljava/lang/String; v Enter quantity: 
 x y z { | java/lang/String equalsIgnoreCase (Ljava/lang/String;)Z
  ~  � 
addProduct "(Lcom/ecommerce/models/Product;I)V � Product not available. � $java/lang/CloneNotSupportedException
 � � �  printStackTrace � Enter new quantity: 
  � V � (Ljava/lang/String;I)V
  � � - removeProduct � 1. 10% Discount � 2. Buy One Get One Free � Choose discount type:  � 3com/ecommerce/strategies/PercentageDiscountStrategy@$      
 � �  � (D)V � 1com/ecommerce/strategies/BuyOneGetOneFreeStrategy
 �  � Invalid discount type. � � � e � )com/ecommerce/strategies/DiscountStrategy (D)D  ` Code LineNumberTable main ([Ljava/lang/String;)V StackMapTable � [Ljava/lang/String; � [Lcom/ecommerce/models/Product; 
SourceFile ECommerceApp.java BootstrapMethods � Total Bill: $ � Total Bill after discount: $ �
 � � � a � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! H           �        *� �    �        	 � �  �  �    � Y� 	� L� Y � M� Y � N� Y� !:� "&� (� ".� (� "0� (� "2� (� "4� (� "6� (� "8� (� ":� (� "<� >+� A6�      �         0   B   M   U   ^   g   z   �� EY,SY-S� G� S,-+� M� H� Q� @+� T� 7+� X� .� "� [� _  � (� +� c� � f� � "j� (��    �   � !   
     '  0  8  @  H  P  X  `  h  p  x  ~  � ! � " � $ � % � ' � ( � * � + � - � . � 0 � 1 � 3  4 6 7
 9 ; �   ' � 0  �  E E   � 
�  � K L  �   W      *L+�=>� +2:� "� l����    �       ?  @  ?  B �    �  ��  
 O P  �   �     W� "o� >-� q:� "u� >-� A6� w� *+� }� � w� *,� }� � "�� (� 
:� ��   L O �  �   6    E  F  G  H  K & L 0 M : N D P L T O R Q S V U �    � 0 xB � 
 V W  �   M     !� "o� >+� qM� "�� >+� A>*,� ��    �       X  Y  Z  [  \   ] 
 Z W  �   7     � "o� >+� qM*,� ��    �       `  a  b  c 
 e W  �   �     f� "�� (� "�� (� "�� >+� A=*� [J� � �Y �� �:� � � �Y� �:� � "�� (�)� � J� ")� �  � (�    �   :    f  g  h  i  k " n ' o 6 p ; q G s O t P w Y x e y �    � 6�  �  �    � �     �  � �  � �   
  � � � 