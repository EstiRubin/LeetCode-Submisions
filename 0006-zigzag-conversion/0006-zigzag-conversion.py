class Solution:
#     def convert(self, s: str, numRows: int) -> str:
# class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s

        rows = [''] * numRows  # יצירת רשימה של מחרוזות ריקות, אחת לכל שורה
        current_row = 0       # השורה הנוכחית שבה אנו כותבים
        going_down = False    # כיוון התנועה: True לירידה, False לעלייה

        for char in s:
            rows[current_row] += char  # הוספת התו הנוכחי לשורה המתאימה

            # שינוי כיוון התנועה
            if current_row == 0 or current_row == numRows - 1:
                going_down = not going_down # היפוך כיוון אם הגענו לשורה העליונה או התחתונה

            # שינוי השורה הנוכחית בהתאם לכיוון
            if going_down:
                current_row += 1
            else:
                current_row -= 1
        
        # חיבור כל המחרוזות מהשורות השונות למחרוזת אחת סופית
        return "".join(rows)