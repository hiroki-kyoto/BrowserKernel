%�ø߶�������ߺ͸߶��˲�������������С�����µ��ۼƳ�����
%��֪��Z(t) = 0.6626*t + 510.3998; H*=H-i*segoma;
%Ҫ����ǡ�[Z(0.15k)-H*(k)]^2 --���ձ��ʽ����segoma��һ��һԪ���η���
%�����������ʽֵ��С��segoma��ֵ��
clear;
clc;
m=-0.0994;
k=[1:1:41]';
H=xlsread('b1.xls','sheet1','A1:A41');
n=510.3043-H(k);
changshu=sum((m*k+n).*(m*k+n));
yijie=sum(2*(m*k+n));
erjie=sum(k.*k);
display([changshu,yijie,erjie]);