import pymysql
from django.shortcuts import render
from .models import CompanyInfo

#클래스형 뷰 (제네릭 뷰), 함수형 뷰

from django.views.generic.list import ListView

# Create your views here.

def main_view(request):
    #company_info = CompanyInfo.objects.all()
    return render(request, 'index/index.html')

def item_view(request):
    return render(request, 'index/charts.html')
