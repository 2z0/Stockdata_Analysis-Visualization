import pymysql
from django.shortcuts import render
from .models import CompanyInfo

#클래스형 뷰 (제네릭 뷰), 함수형 뷰

from django.views.generic.list import ListView

"""
class ListView(ListView):
    model = CompanyInfo

def BookListView(request):
    #
    # books = Book.objects.all()
    def __init__(self):
        try:

            self.conn = pymysql.connect(host='fadodb.cdhgfueefwts.ap-northeast-2.rds.amazonaws.com', user='root',
                                        password='Cseadmin1!', db='INVESTAR', charset='utf8')

            cursor = self.conn.cursor()

            strSql = "SELECT code, company FROM company_info"
            result = cursor.execute(strSql)
            datas = cursor.fetchall()
            self.conn.close()

        except:
            self.conn.rollback()
            print("Failed selecting in BookListView")

        values = {'codes': datas}
        return render(request, 'companyinfo_list.html', values)
    """
# Create your views here.

def main_view(request):
    #company_info = CompanyInfo.objects.all()
    return render(request, 'index/index.html')

def item_view(request):
    return render(request, 'index/charts.html')